CREATE TABLE `category`
(
  `id`            int(10) unsigned NOT NULL AUTO_INCREMENT,
  `category_name` varchar(45)      NOT NULL,
  `parent_id`     int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `category_name_UNIQUE` (`category_name`),
  KEY `parent_id` (`parent_id`),
  CONSTRAINT `fk_category_1` FOREIGN KEY (`parent_id`) REFERENCES `category` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE = InnoDB
  AUTO_INCREMENT = 10
  DEFAULT CHARSET = utf8;


CREATE TABLE `article`
(
  `id`                  int(10) unsigned NOT NULL AUTO_INCREMENT,
  `article_name`        varchar(45)      NOT NULL,
  `article_description` varchar(512)     NOT NULL,
  `article_content`     varchar(4096)    NOT NULL,
  `encode_image`        varchar(45)      NOT NULL,
  `category_id`         int(10) unsigned NOT NULL,
  `date`                date             NOT NULL,
  `author`              varchar(45)      NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `encode_image_UNIQUE` (`encode_image`),
  KEY `fk_article_1_idx` (`category_id`),
  CONSTRAINT `fk_article_1` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE = InnoDB
  AUTO_INCREMENT = 65
  DEFAULT CHARSET = utf8;
