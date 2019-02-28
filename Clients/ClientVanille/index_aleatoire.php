<?php 
	include "../../accesseur/PenseeDAO.php";
	$penseeDAO = new PenseeDAO();
	//print_r($penseeDAO);
	$listePensees = $penseeDAO->listerPensees();
	//print_r($listePensees);
	$indexAleatoire = rand(0, count($listePensees) - 1);
	$pensee = $listePensees[$indexAleatoire];
	// TODO optimiser en prenant un vrai random dans la BDD
?><?php 
header("Content-type: text/xml");
echo '<?xml version="1.0" encoding="UTF-8"?>';
?>
<pensee>
	<auteur><?=($pensee->auteur)?></auteur>
	<message><?=($pensee->message)?></message>
	<annee><?=$pensee->annee?></annee>
	<source><?=$pensee->source?></source>
	<id><?=$pensee->idPensee?></id>
</pensee>