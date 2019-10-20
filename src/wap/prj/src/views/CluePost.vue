<template>
  <div class="CluePost" >
    <form>
      <mt-field label="联系人" placeholder="请输入联系人" type="text" name="clLinkMan" v-model="clLinkMan"></mt-field>
      <mt-field label="手机号" placeholder="请输入手机号" type="text" name="clLinkMob" v-model="clLinkMob"></mt-field>
      <mt-field label="类型" placeholder="请选择服务类型" @click.native="sheetVisible = true" type="text" disabled name="clType" v-model="clTypeV" ></mt-field>

      <mt-field label="说明" placeholder="请输入说明" type="textarea" rows="4" v-model="clDesc"></mt-field>
      <div class="page-button-group">
        <mt-button size="large" type="primary" @click="submit">提交</mt-button>
      </div>
    </form>
    <mt-actionsheet :actions="actions" v-model="sheetVisible"></mt-actionsheet>
  </div>
</template>

<script>
// /CluePost?cltype=5 设置进入自动类型
var locationLa = 0
var locationLo = 0
// 初始化函数
function init () {
  var options = {
    enableHighAccuracy: true,
    timeout: 5000,
    maximumAge: 0
  }
  // 判断浏览器是否支持地理共享
  if (navigator.geolocation) {
    // 获取地理信息，并指定成功的回调函数
    navigator.geolocation.getCurrentPosition(function (pos) {
      locationLo = pos.coords.longitude // 得到经度
      locationLa = pos.coords.latitude // 得到纬度
    }, function (e) {
      console.log(e)
    }, options)
  }
}init()

var types = ['出售二手车', '求购二手车', '家庭保洁', '空调维修', '空调加氟', '电脑维修', '疏通下水道', '清洗油烟机', '小时工', '家政服务及维修']

export default {
  name: 'CluePost',
  data () {
    return {
      sheetVisible: false,
      actions: [],
      clTypeV: '',
      clType: 0,
      clDesc: '',
      clLinkMan: '',
      clLinkMob: ''
    }
  },
  methods: {
    submit () {
      var com = this
      let postData = {clDesc: this.clDesc, clLinkMan: this.clLinkMan, clLinkMob: this.clLinkMob, clType: this.clType, clLa: locationLa, clLo: locationLo}
      this.$http.post(this.$baseUrl + '/clue', postData).then(function (res) {
        var code = com.util.chkRes(res)
        if (code === 0) {
          com.$messagebox.alert('提交成功!', '提示')
          // _this.$router.push('/')
          com.$indicator.close()
        }
      }, function (res) {
        console.log(res.status)
      })
    }
  },
  mounted () {
    // 初始化类型
    let cltype = this.$route.query['cltype']
    if (cltype) {
      this.clTypeV = types[cltype]
      this.clType = cltype
    }

    let com = this
    for (let n in types) {
      let name = types[n]
      let index = parseInt(n) + 1
      this.actions.push({name: name,
        index: index,
        method: function () {
          com.clTypeV = this.name
          com.clType = this.index
          console.log(com.clType)
        }})
    }
  }

}
</script>

<style>
.page-button-group{
  padding: 30px 15px 15px 15px ;
}
</style>
