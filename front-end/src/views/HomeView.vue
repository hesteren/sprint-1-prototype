<script setup>
import List from '../components/AccountsList.vue';

fetch("http://localhost:8080/users", {
  method: "GET"
}).then(resp => resp.json())
.then(data => console.log(data))

</script>

<template>
  <main>
    <List :array="[{
            name: 'Max',
            nfts: ['1']
            }
]"></List>
  </main>
</template>
