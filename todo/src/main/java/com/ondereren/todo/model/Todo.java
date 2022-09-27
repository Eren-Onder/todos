package com.ondereren.todo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Todo {




        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String label;
        private Boolean status;

        public Todo() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public Boolean getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

