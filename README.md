<h1>Product Management API</h1>
<p>Esta es una API REST desarrollada con Java 11 y Spring Boot que permite gestionar productos. La aplicación permite crear, consultar, modificar y eliminar productos, y utiliza una base de datos en memoria (H2), lo que la hace ideal para desarrollo y pruebas.</p>

<h2>Campos del producto</h2>
<p>Cada producto contiene los siguientes campos:</p>
<ul>
  <li><strong>name</strong>: nombre del producto</li>
  <li><strong>description</strong>: descripción</li>
  <li><strong>price</strong>: precio</li>
  <li><strong>quantity</strong>: cantidad disponible</li>
</ul>
<p>También incluye una función extra para listar productos ordenados por precio ascendente.</p>

<h2>Tecnologías utilizadas</h2>
<ul>
  <li>Java 11</li>
  <li>Spring Boot</li>
  <li>Spring Web</li>
  <li>Spring Data JPA</li>
  <li>H2 Database (base de datos en memoria)</li>
  <li>Maven</li>
</ul>

<h2>Cómo ejecutar el proyecto</h2>
<ol>
  <li>Asegurarse de tener Java 11 y Maven instalados.</li>
  <li>Abrir una terminal en la carpeta raíz del proyecto.</li>
  <li>Ejecutar el siguiente comando:</li>
</ol>
<pre><code>mvn spring-boot:run</code></pre>
<p>La aplicación se inicia en <a href="http://localhost:8080">http://localhost:8080</a></p>

<h2>Endpoints disponibles</h2>
<p>Todos los endpoints están bajo la ruta base <code>http://localhost:8080/products</code></p>
<ul>
  <li>POST /products - Crea un nuevo producto</li>
  <li>GET /products - Lista todos los productos</li>
  <li>GET /products/{id} - Consulta un producto por su ID</li>
  <li>GET /products/name/{name} - Consulta un producto por nombre</li>
  <li>PUT /products/{id} - Actualiza un producto existente</li>
  <li>DELETE /products/{id} - Elimina un producto</li>
  <li>GET /products/ordered - Lista los productos ordenados por precio</li>
</ul>

<h2>Ejemplo de JSON para crear o actualizar un producto</h2>
<pre><code>{
  "name": "LG UltraWide Monitor",
  "description": "34-inch UltraWide Full HD with HDR10",
  "price": 599.99,
  "quantity": 15
}
</code></pre>
<p>Para probar con Postman, enviar el JSON como raw, en formato JSON, y asegurarse de que el header <code>Content-Type</code> sea <code>application/json</code>.</p>

<h2>Acceso a la base de datos H2 (opcional)</h2>
<p>Se puede acceder a la consola web de H2 desde <a href="http://localhost:8080/h2-console">http://localhost:8080/h2-console</a></p>
<ul>
  <li>JDBC URL: <code>jdbc:h2:mem:productdb</code></li>
  <li>Usuario: <code>sa</code></li>
  <li>Contraseña: (dejar en blanco)</li>
</ul>
