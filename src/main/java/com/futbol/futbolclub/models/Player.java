package com.futbol.futbolclub.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        private String name,description,picture;

        public String getPicture() {
                return picture;
        }

        public void setPicture(String picture) {
                this.picture = picture;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public Player() {
        }

        public Player(String name,  String picture,String description) {
                this.name = name;
                this.description = description;
                this.picture = picture;
        }
}
