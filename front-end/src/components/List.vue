<template>

  <div :key="item.id" v-for="item in array">
    <p> {{item.data}} </p>
  </div>

</template>




<script>
    export default {
      name: 'List',
      props: {
        array: Array
      },
      components: {

      },
      methods: {

      },
    }
</script>




<style>

</style>