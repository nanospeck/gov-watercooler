<!-- ref : http://bootswatch.com/slate/# -->
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Watercooler: Slate</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../bootstrap.css" media="screen">
<link rel="stylesheet" href="../assets/css/bootswatch.min.css">
<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="../bower_components/html5shiv/dist/html5shiv.js"></script>
      <script src="../bower_components/respond/dest/respond.min.js"></script>
    <![endif]-->
<script>
	/* Analytics here */
</script>
</head>
<body>
	<div class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<a href="../index.jsp" class="navbar-brand">Watercooler</a>
				<button class="navbar-toggle" type="button" data-toggle="collapse"
					data-target="#navbar-main">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</div>
			<div class="navbar-collapse collapse" id="navbar-main">
				<ul class="nav navbar-nav">
					<li><a href="../help/">About us</a></li>
					<li><a href="../help/">Help</a></li>
					<li><a href="http://google.com">Blog</a></li>
				</ul>

				<ul class="nav navbar-nav navbar-right">
					<li><a href="http://builtwithbootstrap.com/" target="_blank">Big
							data, bite size.</a></li>
					<!-- <li><a href="https://wrapbootstrap.com/?ref=bsw" target="_blank">WrapBootstrap</a></li> -->
				</ul>

			</div>
		</div>
	</div>


	<div class="container">

		<div class="page-header" id="banner">
			<div class="row">
				<div class="col-lg-8 col-md-7 col-sm-6">
					<!-- <h1>Watercooler</h1>
					<p class="lead">Big data, bite size.</p> -->
					<br>
					<div class="lead">

						<h3>Here is more description</h3>
						${cardDTO.description} <br /> <img src="/graphs/R2001.png" alt="">
						<br />
						<div style="margin-top: 20px;" align="center">
							<a class="btn btn-success" href='/getcard/${cardDTO.id}'>Back</a>
						</div>

						<%-- <form action="/cardprev">
							<br /> <br />
							<button type="submit" type="button" class="btn btn-success">Previous</button>
						</form>

						<form action='/carddetails/${cardDTO.id}'>
							<br /> <br />
							<button type="submit" type="button" class="btn btn-success">Details</button>
						</form>

						<form action='/cardnext/${cardDTO.id}'>
							<br /> <br />
							<button type="submit" type="button" class="btn btn-success">Next</button>
						</form> --%>
					</div>
				</div>
				<div class="col-lg-4 col-md-5 col-sm-6">
					<div class="sponsor"></div>
				</div>
			</div>
		</div>
		<br />
		<br />
		<br />
		<br />
		<br />


		<footer>
			<div class="row">
				<div class="col-lg-12">

					<ul class="list-unstyled">
						<li class="pull-right"><a href="#top">Back to top</a></li>
						<li><a href="https://twitter.com/akhilkarun">Twitter</a></li>
						<li><a href="https://fb.com/akhil.karun">Facebook</a></li>
					</ul>

					<p>
						Page theme released under the <a
							href="https://github.com/thomaspark/bootswatch/blob/gh-pages/LICENSE">MIT
							License</a>.
					</p>
					<p>
						Based on <a href="http://getbootstrap.com" rel="nofollow">Bootstrap</a>.
						Icons from <a href="http://fortawesome.github.io/Font-Awesome/"
							rel="nofollow">Font Awesome</a>. Web fonts from <a
							href="http://www.google.com/webfonts" rel="nofollow">Google</a>.
					</p>

				</div>
			</div>

		</footer>


	</div>


	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
	<script src="../bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
	<script src="../assets/js/bootswatch.js"></script>
</body>
</html>
