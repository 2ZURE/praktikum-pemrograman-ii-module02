package module02.problem03;

//Pada baris ini terjadi error karena nama class public (Pegawai) tidak sama dengan nama file (Employee.java), dan Main memanggil class Employee
//public class Pegawai {
public class Employee {
    public String name;
    //Pada baris ini terjadi error karena tipe char hanya bisa menampung 1 karakter, sedangkan Main mengisi String ("Kingdom of Orvel") dan getOrigin() mengembalikan String (incompatible types)
    //public char origin;
    public String origin;
    public String role;
    public int age;

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    //Pada baris ini terjadi error karena method tidak memiliki parameter, padahal Main memanggil setRole("Assasin") dan variabel r di dalam method tidak pernah dideklarasikan
    //public void setRole() {
    public void setRole(String r) {
        this.role = r;
    }
}