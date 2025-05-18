🛠️ Hvordan prosjektet er laget

Dette prosjektet er en fullstack webapplikasjon kalt MinTur, laget for å planlegge reiser / registrere for kjøregodtgjørelse. 
1. Backend – Java & Spring Boot

    Spring Boot brukes som rammeverk for å bygge RESTful API-er og koble frontend til databasen.

    Spring Data JPA brukes for å jobbe med databasen via objekter (ORM).

    Hibernate tar seg av mappingen mellom Java-klasser og tabeller i databasen.

    Applikasjonen er konfigurert via application.properties.

2. Frontend – HTML + Bootstrap

    Brukergrensesnittet er laget med HTML5 og Bootstrap 5 for responsivt design.

    Brukeren kan se, legge inn eller slette reiser via enkle og brukervennlige skjema.

3. Database – PostgreSQL på Render

    En PostgreSQL-database er opprettet via Render sin database-integrasjon.

    Spring Boot kobles til databasen via JDBC og application.properties.

    Hibernate sørger for at nødvendige tabeller blir opprettet automatisk (ddl-auto=update).

4. Docker – Bygg og deploy

    Applikasjonen er containerisert med Docker:

        Første steg bygger .jar-filen med Maven.

        Andre steg lager en lettvekts container som kjører Spring Boot-applikasjonen.

    Dockerfilen gjør det enkelt å deploye hvor som helst (Render, Oracle Cloud, AWS, m.m.).

