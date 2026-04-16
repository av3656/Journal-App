<h1 align="center">📓 Journal App</h1>

<p align="center">
  A simple and secure Journal Application built using Spring Boot.
</p>

<hr>

<h2>🚀 Features</h2>
<ul>
  <li>Create, read, update, and delete journal entries</li>
  <li>User authentication (login/signup)</li>
  <li>RESTful APIs</li>
  <li>Clean and scalable backend architecture</li>
</ul>

<hr>

<h2>🛠️ Tech Stack</h2>
<ul>
  <li><b>Backend:</b> Spring Boot</li>
  <li><b>Database:</b> MySQL / MongoDB</li>
  <li><b>Build Tool:</b> Maven</li>
  <li><b>Language:</b> Java</li>
</ul>

<hr>

<h2>📂 Project Structure</h2>

<pre>
src/
 ├── main/
 │   ├── java/com/example/journal/
 │   │   ├── controller/
 │   │   ├── service/
 │   │   ├── repository/
 │   │   └── model/
 │   └── resources/
 │       ├── application.properties
</pre>

<hr>

<h2>⚙️ Installation & Setup</h2>

<ol>
  <li>Clone the repository</li>
</ol>

<pre>
git clone https://github.com/av3656/Journal-App.git
</pre>

<ol start="2">
  <li>Navigate to the project folder</li>
</ol>

<pre>
cd Journal-App
</pre>

<ol start="3">
  <li>Run the application</li>
</ol>

<pre>
mvn spring-boot:run
</pre>

<hr>

<h2>📬 API Endpoints</h2>

<table border="1" cellpadding="8">
  <tr>
    <th>Method</th>
    <th>Endpoint</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>GET</td>
    <td>/api/journal</td>
    <td>Get all entries</td>
  </tr>
  <tr>
    <td>POST</td>
    <td>/api/journal</td>
    <td>Create entry</td>
  </tr>
  <tr>
    <td>PUT</td>
    <td>/api/journal/{id}</td>
    <td>Update entry</td>
  </tr>
  <tr>
    <td>DELETE</td>
    <td>/api/journal/{id}</td>
    <td>Delete entry</td>
  </tr>
</table>

<hr>

<h2>📸 Screenshots</h2>

<p>Add screenshots here (optional)</p>

<hr>

<h2>🤝 Contributing</h2>

<p>Pull requests are welcome. For major changes, please open an issue first.</p>

<hr>

<h2>📄 License</h2>

<p>This project is licensed under the MIT License.</p>

<hr>

<p align="center">⭐ If you like this project, give it a star!</p>
