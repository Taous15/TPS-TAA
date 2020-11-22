
# TP2 TAA
# hsqldb

Récupérez et lancez une base de données HSQLDB. 

Ouvrez un terminal. 

Vous pouvez supprimer les données anciennes avec `` rm -rd data/*``

Démarrez la base de données et exécutez ``./run-hsqldb-server.sh``  et ``./show-hsqldb.sh``.

Connectez-vous à la base de données : 
- User : ``SA``
- Password : ````
- URL : ``jdbc:hsqldb:hsql://localhost/``

## TEST

On vérifie le test dans un navigateur. 

``http://localhost:8080/myform.html``
``http://localhost:8080/UserInfoKanban``

http://localhost:8080/myform.html

Recapitulatif des informations
    • Nom: Taous 
    • Prenom: abbbbbbbb 
    • Age: 200 

 
 http://localhost:8080/user/1
 <User>
<id>0</id>
</User>



### Jetty
 
 Afin de démarrer le serveur Jetty, on fait clique droit sur le projet. 
``run as => maven build … ``=> on met le package ``jetty:run`` dans le ``goal``.
On remplie les formulaires dans la page ``http://localhost:8080/myform.html`` et ``http://localhost:8080/UserInfoKanban``
On se connecte à la base de données (hsqldb)

Dans hsqldb, pour créer la requête, on utilise la requête suivante:

 - select * from kanban
 
 
#### JAXRS

Dans Eclipse, on trouve le fichier ``/TAA_TP2/jaxrs/RestServer.java`` permettant d'exécuter le programme.
 ``RestServer.java => Run AS => Java Application ``
On teste le service "implanter" à l’aide d'un navigateur à travers le lien suivant. 
 ``http://localhost:8080/kanban/1``
 



 
 
