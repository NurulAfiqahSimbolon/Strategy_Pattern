Analisa ini berfokus pada bagian interface TravelStrategy dan implementasinya pada class CarStrategy dan MotorcyleStrategy.
1) interface TravelStrategy:

    a. interface ini mendefinisikan sebuah kontak yang harus dipenuhi oleh class yang ingin menjadi strategi untuk menghitung biaya perjalanan.
    
    b. calculateCost(double distance): Metode ini wajib diimplementasikan oleh class yang mengimplementasikan interface TravelStrategy.

    c. Parameter: distance(double) - jarak tempuh perjalanan.

    d. Return Value: double - biaya perjalanan berdasarkan strategy yang diimplementasikan.

2) Class CarStrategy dan MotorcyleStrategy:

    a. kedua class ini mengimplementasikan interface TravelStrategy

    b. calculateCost(double distance):

        1. CarStrategy:
         - Mwngimplementasikan perhitungan biaya perjalanan dengan mobil, yaitu jarak dikali dengan 0.5
         - Kemungkinan 0.5 ini mewakili biaya per kilometer untuk mobil.
        2. MotorcyleStrategy:
         - Mengimplementasikan perhitungan biaya perjalanan dengan motor, yaitu jarak dikali dengan 0.25.
         - Kemungkinan 0.25 ini mewakili biaya per kilometer untuk motor.