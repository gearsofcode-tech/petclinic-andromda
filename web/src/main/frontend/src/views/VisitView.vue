<template>
  <div>
    <h1>Visit</h1>
    <table>
    <tr>
            <th>id</th>
          </tr>
    <tr v-for="entity in entities">
            <td>{{entity.id}}</td>
          </tr>
  </table>
  </div>
</template>

<script>
import { useVisitStore } from '@/stores/VisitStore.js'


export default{
  

    data() {
        const store = useVisitStore();        
        return {
            entities: store.findAll
        }
    },

    mounted(){
        const store = useVisitStore();        
        store.fetchAll();
    }
}
</script>
