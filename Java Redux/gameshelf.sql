	CREATE DATABASE IF NOT EXISTS gameshelf;
    
    CREATE TABLE IF NOT EXISTS games(
		id INT AUTO_INCREMENT PRIMARY KEY,
        title VARCHAR(100),
		publisher VARCHAR(50) AFTER title,
        designer VARCHAR(50);
        )