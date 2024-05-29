package Pertemuan12;

class film11 {
    int id;
    String judul;
    double rating;
    film11 prev, next;
    
        film11 (int id, String judul, double rating) {
            this.id = id;
            this.judul = judul;
            this.rating = rating;
        }
    }
