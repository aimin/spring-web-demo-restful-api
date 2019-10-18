<template>
  <div class="page-msgbox">
    <mt-button @click="aa" size="large">xxxxx</mt-button>
  </div>
</template>

<script>
export default {
  methods: {
    aa () {
      this.util.GetUserInfo()
    }
  }
}
</script>
