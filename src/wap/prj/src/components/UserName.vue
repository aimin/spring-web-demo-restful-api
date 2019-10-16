<template>

  <mt-field label="用户名" placeholder="用户名/邮箱/手机号" type="text" v-model="username" v-on:change="usernameVerification" v-bind:state="usernameVerification()" name="uname"></mt-field>
</template>
<script>
export default {
  name: 'UserName',
  data () {
    return {
      username: ''
    }
  },
  methods: {
    usernameVerification () {
      var reg = /^[a-zA-Z0-9|@|.]+$/
      if (this.username === '') {
        return ''
      } else if (!reg.test(this.username)) {
        console.log('用户名只能包含大小字母、数字')
        return 'error'
      } else {
        console.log('success')
        return 'success'
      }
    }
  }
}
</script>
