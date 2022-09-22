<template>

  <h1>List component</h1>

    <div v-for="item in array">
      <p> {{item.data}} </p>
    </div>


</template>

<script>
    export default {
      name: 'List',
      props: {
        array: Array
      },
    }
</script>

<style scoped>

</style>