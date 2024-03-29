DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS material;
DROP TABLE IF EXISTS project_category;
DROP TABLE IF EXISTS category;
DROP TABLE IF EXISTS step;

CREATE TABLE step(
 step_id INT AUTO_INCREMENT NOT NULL,
 project_id INT NOT NULL,
 step_text TEXT,
 step_order INT,
 PRIMARY KEY (step_id),
 FOREIGN KEY (project_id) REFERENCES project(project_id)
);

CREATE TABLE category(
 category_id INT AUTO_INCREMENT NOT NULL,
 category_name VARCHAR(128) NOT NULL,
 PRIMARY KEY (category_id)
);

CREATE TABLE project_category(
 project_id INT NOT NULL,
 category_id INT NOT NULL,
 PRIMARY KEY (project_id, category_id),
 FOREIGN KEY (project_id) REFERENCES project(project_id),
 FOREIGN KEY (category_id) REFERENCES category(category_id)
);

CREATE TABLE material(
 material_id INT AUTO_INCREMENT NOT NULL,
 project_id INT NOT NULL,
 material_name VARCHAR(128) NOT NULL,
 cost DECIMAL(10, 2) NOT NULL,
 PRIMARY KEY(material_id),
 FOREIGN KEY(project_id) REFERENCES project(project_id)
);

CREATE TABLE project(
 project_id INT AUTO_INCREMENT NOT NULL,
 project_name VARCHAR(128) NOT NULL,
 estimated_hours TIME,
 difficulty INT,
 notes TEXT,
 PRIMARY KEY(project_id)
);
