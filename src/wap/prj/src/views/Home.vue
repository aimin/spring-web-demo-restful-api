<template>
  <div class="page-button">
    <div class="page-button-group">
      <mt-button size="large" type="primary">前台</mt-button>
      <router-link to="/Cluemg"><mt-button size="large" type="danger" >管理后台</mt-button></router-link>
    </div>

    <div class="page-msgbox">
      <mt-button @click="logout" size="large">退出</mt-button>
      <mt-button @click="test" size="large">test</mt-button>
    </div>
  </div>

</template>

<style lang="css">
  a {
    text-decoration: none;
  }

  .page-button button{
    margin-top: 10%;
    width: 80%;
    margin-left: 10%;
    /*margin: 15px 0px 15px 0px ;*/
  }
</style>

<script>
export default {
  methods: {
    logout () {
      this.util.LoginOut()
      this.$router.push('/Login')
    },
    test () {
      console.log(99)
    }
  }
}
</script>
