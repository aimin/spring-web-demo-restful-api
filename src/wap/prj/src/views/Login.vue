<template>
  <div class="Login" >
    <form>
    <div class="page-part">
      <com-user-name ref="comUserName"></com-user-name>
      <com-password ref="comPassword"></com-password>
    </div>
    <com-VerifyCode ref="comVerifyCode"></com-VerifyCode>

    <div class="page-button-group">
      <mt-button size="large" type="primary" @click="submit">登录</mt-button>
    </div>
    </form>
  </div>
</template>

<script>
import VerifyCode from '@/components/VerifyCode'
import Password from '@/components/Password'
import UserName from '@/components/UserName'

export default {
  name: 'Login',
  components: {
    comVerifyCode: VerifyCode,
    comPassword: Password,
    comUserName: UserName
  },
  methods: {
    submit (e) {
      var _this = this
      var postData = {uname: this.$refs.comUserName.username, pwd: this.$refs.comPassword.passwd, verifyCode: this.$refs.comVerifyCode.code}
      if (postData.uname === '') {
        alert('用户名不可以空')
        return
      }
      if (postData.pwd === '') {
        alert('密码不可以空')
        return
      }
      if (postData.code === '') {
        alert('请输入验证码')
        return
      }
      postData = this.qs.stringify(postData)
      this.$http.post(this.$baseUrl + '/login', postData).then(function (res) {
        var code = _this.util.chkRes(res)
        if (code === 0) {
          _this.util.loginSuccess(res)
        }
      }, function (res) {
        console.log(res.status)
      })
    }
  }

}
</script>

<style>
.page-button-group{
  padding: 30px 15px 15px 15px ;
}
</style>
