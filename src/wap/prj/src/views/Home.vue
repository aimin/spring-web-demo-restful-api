<template>
  <div class="page-msgbox">
    <mt-button @click="logout" size="large">退出</mt-button>
  </div>
</template>

<script>
export default {
  methods: {
    logout () {
      this.util.LoginOut()
      this.$router.push('/Login')
    }
  }
}
</script>
