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
      console.log()
      var postData = {uname: this.$refs.comUserName.username, pwd: this.$refs.comPassword.passwd, verifyCode: this.$refs.comVerifyCode.code}
      console.log(postData)
      postData = this.qs.stringify(postData)
      this.$http.post(this.$baseUrl + '/login', postData).then(function (res) {
        console.log(res.body)
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
