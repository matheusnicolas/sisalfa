CREATE TABLE `user` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`username` varchar(255) NOT NULL,
`password` varchar(255) NOT NULL,
`email` varchar(255) NOT NULL,
`first_name` varchar(255) NOT NULL,
`last_name` varchar(255) NOT NULL,
`photo` varchar(255) DEFAULT NULL,
`perfil` varchar(255) NOT NULL,
 PRIMARY KEY(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `context` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`user_id` bigint(20) NOT NULL,
`name` varchar(255) NOT NULL,
`image` varchar(255) NOT NULL,
`sound` varchar(255) NOT NULL,
`video` varchar(255) NOT NULL,
PRIMARY KEY(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `challenge` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`context_id` bigint(20) NOT NULL,
`user_id` bigint(20) NOT NULL,
`word` varchar(255) NOT NULL,
`image` varchar(255) NOT NULL,
`sound` varchar(255) NOT NULL,
`video` varchar(255) NOT NULL,
PRIMARY KEY(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

ALTER TABLE `context`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
  
ALTER TABLE `challenge`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

ALTER TABLE `context`
  ADD FOREIGN KEY(`user_id`) REFERENCES `user`(`id`);
  
ALTER TABLE `challenge`
  ADD FOREIGN KEY(`context_id`) REFERENCES `context`(`id`);
 
