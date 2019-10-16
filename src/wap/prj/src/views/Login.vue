<template>
  <div class="Login" >
    <form>
    <div class="page-part">
      <mt-field label="用户名" placeholder="用户名/邮箱/手机号" type="text" name="uname"></mt-field>
      <com-password></com-password>
    </div>
    <com-VerifyCode></com-VerifyCode>

    <div class="page-button-group">
      <mt-button size="large" type="primary">登录</mt-button>
    </div>
    </form>
  </div>
</template>

<script>
import VerifyCode from '@/components/VerifyCode'
import Password from '@/components/Password'

export default {
  name: 'Login',
  components: {
    comVerifyCode: VerifyCode,
    comPassword: Password
  }

}
</script>

<style>
.page-button-group{
  padding: 30px 15px 15px 15px ;
}
</style>
