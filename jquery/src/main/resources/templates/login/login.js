function login(){
    document.write("JS started");
    // (A) LOAD DB MODULE
    const mysql = require("mysql");

// (B) CREATE CONNECTION - CHANGE TO YOUR OWN !
    const db = mysql.createConnection({
        host: "localhost",
        user: "study",
        password: "1111",
        database: "sessiondb"
    });
    db.connect((err) => {
        if (err) { throw err; }
        document.write("DB connection OK");
    });

// (C) QUERY
    db.query("SELECT * FROM `users`", (err, results) => {
        if (err) { throw err; }
        document.write(results);
    });
    document.write("JS finished");
}