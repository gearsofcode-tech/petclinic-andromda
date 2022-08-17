<template>
  <div>
    <h1>Owner</h1>
    <table>
    <tr>
            <th>address</th>
            <th>telephone</th>
            <th>firstName</th>
            <th>lastName</th>
            <th>id</th>
          </tr>
    <tr v-for="entity in entities">
            <td>address</td>
            <td>telephone</td>
            <td>firstName</td>
            <td>lastName</td>
            <td>id</td>
          </tr>
  </table>
  </div>
</template>

<script>
export default{
  data() {
    return {
      entities: [{      address: 'address',
            telephone: 'telephone',
            firstName: 'firstName',
            lastName: 'lastName',
            id: 'id',
      }]
    }
  }
}
</script>