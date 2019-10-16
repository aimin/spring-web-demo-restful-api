<template>
  <div class="Login" >
    <form>
    <div class="page-part">
      <com-user-name></com-user-name>
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
import UserName from '@/components/UserName'

export default {
  name: 'Login',
  components: {
    comVerifyCode: VerifyCode,
    comPassword: Password,
    comUserName: UserName
  }

}
</script>

<style>
.page-button-group{
  padding: 30px 15px 15px 15px ;
}
</style>
