<template>
  <div id="app">

    <mt-header title="小蓝鹊 ">
      <router-link to="/" slot="left">
        <mt-button icon="back"></mt-button>
      </router-link>
      <mt-button slot="right" icon="more"></mt-button>
    </mt-header>



    <router-view/>
  </div>
</template>

<script>

export default {
  name: 'App'
}
</script>


<style>
  body{
    margin: 0px;
  }

  div{
    padding: 0px;
  }
</style>
