<template>
  <div>
    <h1>Veterinarian</h1>
    <br/>
    <table>
    <tr>
      <th>First name</th>
      <th>Last name</th>
    </tr>
    <tr v-for="vet in vets">
      <td>{{ vet.firstName }}</td>
      <td>{{ vet.lastName }}</td>
    </tr>
  </table>
  </div>
 
</template>

<script>
export default{
  data() {
    return {
      vets: [{ firstName: 'John', lastName: 'Graham' }, { firstName: 'Kelly', lastName: 'Morrison' }]
    }
  }
}
</script>
