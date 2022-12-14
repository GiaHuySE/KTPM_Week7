package com.example.RestAPI.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.RestAPI.Entity.ChuyenBay;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String>{
	@Query(value = "select * from chuyenbay where GaDen = 'DAD'", nativeQuery = true)
	public List<ChuyenBay> findChuyenBaystoGaDiDAD();
	
	@Query(value = "select * from chuyenbay where DoDai > 8000 and DoDai < 10000", nativeQuery = true)
	public List<ChuyenBay> findChuyenBayDoDaiHon8VaNhoHon10();
	
	@Query(value = "select * from chuyenbay where (GaDi = 'SGN' and GaDen = 'BMV')", nativeQuery = true)
	public List<ChuyenBay> findChuyenBaySGtoiBMT();
	
	@Query(value = "SELECT count(*) chuyenbay where GaDi=?", nativeQuery = true)
	public Integer countChuyenBayFromGaDi(String gaDi);
}
