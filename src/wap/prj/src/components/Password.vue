<template>

      <mt-field label="密码" placeholder="密码" type="text" v-model="passwd" v-on:change="passwordVerification" v-bind:state="passwordVerification()" name="pwd" ></mt-field>
</template>
<script>
export default {
  name: 'Password',
  data () {
    return {
      passwd: ''
    }
  },
  methods: {
    passwordVerification () {
      var reg = /^(?=.*\d)(?=.*[a-zA-Z])[\da-zA-Z]{6,}$/
      if (this.passwd === '') {
        return ''
      } else if (reg.test(this.passwd)) {
        return 'success'
      } else {
        console.log('必须6-16位，包含大小字母、数字')
        return 'error'
      }
    }
  }
}
</script>
