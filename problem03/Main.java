package module02.problem03;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        //Pada baris ini terjadi error karena kurangnya titik koma (;)
        //e.name = "Roi"
        e.name = "Roi";
        e.origin = "Kingdom of Orvel";
        //Umur tidak pernah diisi sehingga bernilai default 0, padahal output yang diminta adalah 17
        e.age = 17;
        e.setRole("Assasin");

        //Output yang diminta "Nama: Roi", tetapi kode mencetak "Nama Pegawai: "
        //System.out.println("Nama Pegawai: " + e.getName());
        System.out.println("Nama: " + e.getName());
        System.out.println("Asal: " + e.getOrigin());
        System.out.println("Jabatan: " + e.role);
        //Output yang diminta "Umur: 17 tahun", tetapi kode hanya mencetak angkanya saja
        //System.out.println("Umur: " + e.age);
        System.out.println("Umur: " + e.age + " tahun");
    }
}