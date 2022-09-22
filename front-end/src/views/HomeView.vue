<script setup>
import TheWelcome from '../components/TheWelcome.vue'
import List from "../components/List";



export default {

  created() {
    this.accounts = [
      {
        id: 1,
        name: 'Max',
      },
      {
        id: 2,
        name: 'Sel',
      },
      {
        id: 3,
        name: 'Kes',
      },
    ]
  },
  data() {
    return {
      accounts: []
    }
  }
}






</script>

<template>
  <main>
    <List :array="accounts"></List>
  </main>
</template>
