<template>
  <div>
    <h1>Veterinarian 2</h1>
    <br/>
    <table>
    <tr>
      <th>Name</th>
      <th>Birthdate</th>
    </tr>
    <tr v-for="vet in vets" :key="vet.id">
      <td>{{ vet.name }}</td>
      <td>{{ vet.birthDate }}</td>
    </tr>
  </table>
  </div>
 
</template>

<script>
import { useVetStore } from '@/stores/VetStore.js'


export default{
  

    data() {
        const store = useVetStore();        
        return {
            vets: store.findAll
        }
    },

    mounted(){
        const store = useVetStore();        
        store.fetchAll();
    }
}
</script>
