<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Formulário</title>
</head>
<body>
<form action="cadastro_vaga" method="post">
  <!-- action = define a ação a ser performada quando o forms for submetido
  method = é o método http que vai ser utilizado -->
  <div class="form-group">
    <label for="nomeForm">Nome</label>
    <input type="text" id="nomeForm" name="field_nome">
  </div>
  <div class="form-group">
    <label for="dtaNascForm">Data Nascimento</label>
    <input type="text" id="dtaNascForm" name="field_data">
  </div>
  <div class="form-group col-md-4">
    <label for="idiomaForm">Idioma Nativo</label>
    <select name="field_idioma" id="idiomaForm" class="form-control">
      <option  value="ESPANHOL">Espanhol</option>
      <option  value="INGLES">Inglês</option>
      <option  value="PORTUGUES" selected>Português</option>
      <!--https://stackoverflow.com/questions/11729564/httpservlet-request-getparameter-of-unchecked-and-checked-check-boxes-in-java-->
    </select>
  </div>
  <div class="form-check">
    <label>Habilidades Técnicas
    <input class="form-check-input" type="checkbox" name="field_habilidades" value="JAVA" id="java"> Java
    <input class="form-check-input" type="checkbox" name="field_habilidades" value="JAVASCRIPT" id="javaScript"> JavaScript
    <input class="form-check-input" type="checkbox" name="field_habilidades" value="CSS" id="css"> CSS
    <input class="form-check-input" type="checkbox" name="field_habilidades" value="HTML" id="html" checked> HTML
    </label>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>