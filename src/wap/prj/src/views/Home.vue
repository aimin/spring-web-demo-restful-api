<template>
  <div class="page-msgbox">
    <mt-button @click="logout" size="large">退出</mt-button>
    <mt-button @click="test" size="large">test</mt-button>
  </div>
</template>

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
