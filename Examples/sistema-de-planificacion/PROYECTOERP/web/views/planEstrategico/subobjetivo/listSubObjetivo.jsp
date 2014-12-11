<%@page import="maristas.beans.UsuarioBean"%>
<%@page import="maristas.dao.subObjetivoDAO"%>
<%@page import="maristas.beans.SubObjetivoBean"%>
<%@page import="java.util.ArrayList"%>
<%
    SubObjetivoBean  subObjetivoBean = null;
    UsuarioBean  userBean = null;
    ArrayList<SubObjetivoBean> sub_objetivos=null;
%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/bootstrap.min.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/font-awesome.min.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/main.css">
</head>
<body>
        <script>
            function regresar(){
                document.form.action = "<%=request.getContextPath()%>/ObjetivoServlet";
                document.form.method = "GET";
                document.form.option.value="2";
                document.form.submit();
            }
            function crear() {
                document.form.action = "<%=request.getContextPath()%>/SubObjetivoServlet";
                document.form.method = "GET";
                document.form.option.value="2";
                document.form.submit();
            }
            function actualizar() {
                document.form.action = "<%=request.getContextPath()%>/SubObjetivoServlet";
                document.form.method = "GET";
                document.form.option.value="3";
                document.form.submit();
            }
            function eliminar() {
                document.form.action = "<%=request.getContextPath()%>/SubObjetivoServlet";
                document.form.method = "POST";
                document.form.option.value="3";
                document.form.submit();
            }
            function cerrarSesion() {
                document.form.action = "<%=request.getContextPath()%>/UsuarioServlet";
                document.form.method = "GET";
                document.form.option.value="SALIR";
                document.form.submit();
            }
        </script>
                <nav class="navbar navbar-default" role="navigation">
          <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
              <a class="navbar-brand" href="#">Maristas</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

              <ul class="nav navbar-nav navbar-right">
                <li>
                    <a href="#">
                    <%  userBean = (UsuarioBean)session.getAttribute("DatosUsuario"); 
                        if(userBean != null) {
                            out.println(userBean.getUsername());
                        }
                    %>
                    </a>
                </li>
               <li class="dropdown"><a href="#">Salir</a></li>
              </li>
              </ul>
            </div><!-- /.navbar-collapse -->
          </div><!-- /.container-fluid -->
        </nav>
	<div class="container">
		<br>
		<header>
		<a onclick="crear()" class="pull-right btn btn-primary btn-lg">+ Crear</a>
                <a href="<%=request.getContextPath()%>/PlanEstrategicoServlet" class="pull-right btn btn-info btn-lg">Regresar</a>
		<hr>
                <h1>Sub Objetivos </h1>
		<hr>
		</header>		
		<br>
		<section class="row">
			<form class="col-sm-12" name="form">
                            <input type="hidden" name="option">
                            <input type="hidden" name="id_linea" value="<%=request.getAttribute("id_linea") %>">
                            <input type="hidden" name="id_linea" value="<%=request.getAttribute("id_linea") %>">
                            <input type="hidden" name="id_objetivo" value="<%=request.getAttribute("id_objetivo") %>">
				<fieldset class="form-group">
					<div class="row">
						<div class="col-sm-1">
							<label class="label-control" >Buscar: </label>
						</div>
						<div class="col-sm-4">
							<input type="text" class="form-control" autofocus="true" id="txtSearch" placeholder="Buscando...">
						</div>				
					</div>					
					<br>
				</fieldset>
				<br>
				<fieldset>
					<table class="table table-stripped table-responsive">
						<thead>
							<tr>
								<th>#</th>
								<th>Nombre</th>
								<th>Descripción</th>
							</tr>
						</thead>
                                                <tbody id="table">
                                                    <%  
                                                        sub_objetivos = (ArrayList<SubObjetivoBean>)request.getAttribute("sub_objetivos");  
                                                        if(sub_objetivos != null) {
                                                            for(SubObjetivoBean   obj:sub_objetivos) {   %>
                                                            <tr>
                                                               <td><%=obj.getId()%></td>
                                                               <td><%=obj.getNombre()%></td>
                                                               <td><%=obj.getDescripcion()%></td>
                                                           </tr>
                                                          <%   }
                                                          }%>
                                                </tbody>
					</table>
				</fieldset>
			</form>
		</section>
	</div>
	<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/plugins/jquery-1.11.1.min.js"></script>
            <script type="text/javascript" src="<%=request.getContextPath()%>/static/js/plugins/jquery-migrate-1.2.1.min.js"></script>
       <script type="text/javascript" src="<%=request.getContextPath()%>/static/js/plugins/bootstrap.min.js"></script>
            <script type="text/javascript" src="<%=request.getContextPath()%>/static/js/app.js"></script>

</body>
</html>