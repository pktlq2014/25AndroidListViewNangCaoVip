package com.example.a25androidlistviewnangcaovip;

public class MonAn
{
    public int id;
    public String tenMonAn;
    public Integer giaMonAn;
    public Integer hinhAnh;

    public MonAn() {
    }

    public MonAn(int id, String tenMonAn, Integer giaMonAn, Integer hinhAnh) {
        this.id = id;
        this.tenMonAn = tenMonAn;
        this.giaMonAn = giaMonAn;
        this.hinhAnh = hinhAnh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public Integer getGiaMonAn() {
        return giaMonAn;
    }

    public void setGiaMonAn(Integer giaMonAn) {
        this.giaMonAn = giaMonAn;
    }

    public Integer getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(Integer hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
