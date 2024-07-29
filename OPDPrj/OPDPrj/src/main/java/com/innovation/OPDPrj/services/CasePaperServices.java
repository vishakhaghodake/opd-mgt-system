package com.innovation.OPDPrj.services;

import java.util.List;

import com.innovation.OPDPrj.model.CasePaper;

public interface CasePaperServices {
	CasePaper insert(CasePaper cp);
	void delete(long cid);
	CasePaper update(long cid,CasePaper cp);
	CasePaper search(long cid);
	List<CasePaper> getAll();
}
