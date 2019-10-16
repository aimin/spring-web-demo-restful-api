<template>
  <div class="Login" >

    <div class="page-part">
      <mt-field label="用户名" placeholder="用户名/邮箱/手机号" type="uname"></mt-field>
      <mt-field label="密码" placeholder="密码" type="password"></mt-field>
    </div>

    <div class="page-part">
      <mt-field label="验证码" placeholder="输入验证码">
        <!--<img v-bind:src="this.$baseUrl+'/createImg'" height="35px" width="100px">-->
        <img v-bind:src="url" v-on:click="say" height="35px" width="100px">
      </mt-field>
    </div>

    <div class="page-button-group">
      <mt-button size="large" type="primary">登录</mt-button>
    </div>

  </div>
</template>

<script>
export default {
  name: 'Login',
  data () {
    return {
      url: (this.$baseUrl + '/createImg'),
      say:function (e) {
        // var n = Math.random()
        console.log(e.target.src)
        console.log(this)
      }
    }
  }
}
</script>

<style>
.page-button-group{
  padding: 30px 15px 15px 15px ;
}
</style>
