package com.example.demo.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

public class DienThoaiNKDTO {
private  Long id;
	
	private String name;
	
	private String madt;
	private long mank;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date ngaynhap;
	
	private MultipartFile hinhanh;
	
	private Long soluong;
	
	private Long giaban;
   
	private String maloaidt;
	private int isdelete;
	
	public int getIsdelete() {
		return isdelete;
	}

	public long getMank() {
		return mank;
	}

	public void setMank(long mank) {
		this.mank = mank;
	}

	public DienThoaiNKDTO(Long id, String name, String madt,long mank, Date ngaynhap, MultipartFile hinhanh,
			Long soluong, Long giaban, String maloaidt, int isdelete) {
		super();
		this.id = id;
		this.name = name;
		this.madt = madt;
		this.mank = mank;
		this.ngaynhap = ngaynhap;
		this.hinhanh = hinhanh;
		this.soluong = soluong;
		this.giaban = giaban;
		this.maloaidt = maloaidt;
		this.isdelete = isdelete;
	}

	public DienThoaiNKDTO(Long id, String name, String madt, Date ngaynhap, MultipartFile hinhanh, Long soluong,
			Long giaban, String maloaidt, int isdelete) {
		super();
		this.id = id;
		this.name = name;
		this.madt = madt;
		this.ngaynhap = ngaynhap;
		this.hinhanh = hinhanh;
		this.soluong = soluong;
		this.giaban = giaban;
		this.maloaidt = maloaidt;
		this.isdelete = isdelete;
	}

	public void setIsdelete(int isdelete) {
		this.isdelete = isdelete;
	}

	public DienThoaiNKDTO() {
		super();
	}

	public DienThoaiNKDTO(String name, String madt, Date ngaynhap, MultipartFile hinhanh, Long soluong, Long giaban,
			String maloaidt) {
		super();
		this.name = name;
		this.madt = madt;
		this.ngaynhap = ngaynhap;
		this.hinhanh = hinhanh;
		this.soluong = soluong;
		this.giaban = giaban;
		this.maloaidt = maloaidt;
	}

	public DienThoaiNKDTO(Long id, String name, String madt, Date ngaynhap, MultipartFile hinhanh, Long soluong,
			Long giaban, String maloaidt) {
		super();
		this.id = id;
		this.name = name;
		this.madt = madt;
		this.ngaynhap = ngaynhap;
		this.hinhanh = hinhanh;
		this.soluong = soluong;
		this.giaban = giaban;
		this.maloaidt = maloaidt;
	}

	public DienThoaiNKDTO(Long id) {
		super();
		this.id = id;
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

	public String getMadt() {
		return madt;
	}

	public void setMadt(String madt) {
		this.madt = madt;
	}

	public Date getNgaynhap() {
		return ngaynhap;
	}

	public void setNgaynhap(Date ngaynhap) {
		this.ngaynhap = ngaynhap;
	}

	public MultipartFile getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(MultipartFile hinhanh) {
		this.hinhanh = hinhanh;
	}

	public Long getSoluong() {
		return soluong;
	}

	public void setSoluong(Long soluong) {
		this.soluong = soluong;
	}

	public Long getGiaban() {
		return giaban;
	}

	public void setGiaban(Long giaban) {
		this.giaban = giaban;
	}

	public String getMaloaidt() {
		return maloaidt;
	}

	public void setMaloaidt(String maloaidt) {
		this.maloaidt = maloaidt;
	}

}
