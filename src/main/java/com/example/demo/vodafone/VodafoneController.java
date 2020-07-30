package com.example.demo.vodafone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@Controller
@RequestMapping("/demo")
public class VodafoneController
{
	//~ Methods ----------------------------------
	/**
	 * DOCUMENT ME!
	 *
	 * @return
	 */
	@RequestMapping(
		method = GET,
		produces = "application/json"
	)
	@ResponseBody
	public String demo()
	{
		return "{\"hello\":\"world\"}";
	}
}
