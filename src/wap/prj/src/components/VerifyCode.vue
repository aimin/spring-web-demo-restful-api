<template>

    <div class="page-part">
      <mt-field label="验证码" placeholder="输入验证码" v-model="code" name="verifyCode">
        <!--<img v-bind:src="this.$baseUrl+'/createImg'" height="35px" width="100px">-->
        <img v-bind:src="url" v-on:click="ChangeCode" height="35px" width="100px" >
      </mt-field>
    </div>

</template>

<script>
export default {
  name: 'VerifyCode',
  data () {
    return {
      url: (this.$baseUrl + '/createImg'),
      code: ''
    }
  },
  methods: {
    ChangeCode () {
      this.url = (this.$baseUrl + '/createImg') + '?' + Math.random()
    }
  }
}
</script>
