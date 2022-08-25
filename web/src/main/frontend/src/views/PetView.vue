<template>
  <div>
    <h1>Pet</h1>
    <table>
    <tr>
            <th>birthDate</th>
            <th>name</th>
            <th>id</th>
          </tr>
    <tr v-for="entity in entities">
            <td>{{entity.birthDate}}</td>
            <td>{{entity.name}}</td>
            <td>{{entity.id}}</td>
          </tr>
  </table>
  </div>
</template>

<script>
import { usePetStore } from '@/stores/PetStore.js'


export default{
  

    data() {
        const store = usePetStore();        
        return {
            entities: store.findAll
        }
    },

    mounted(){
        const store = usePetStore();        
        store.fetchAll();
    }
}
</script>
