package com.mphasis.onlinefoododering.OnlineFoodOdering.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.onlinefoododering.OnlineFoodOdering.exception.ResourceNotFoundException;
import com.mphasis.onlinefoododering.OnlineFoodOdering.model.ViewOrders;
import com.mphasis.onlinefoododering.OnlineFoodOdering.service.ViewOrderService;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
@RestController

public class ViewOrderController {
	
	@Autowired
	ViewOrderService orderService;
	
	@GetMapping("/getAllOrders")
	public List<ViewOrders> getViewOrders() {
		List<ViewOrders> orderList = orderService.fetchorders();
        return orderList;
     }
	
	// http://localhost:8080/api/v1/getorder/1
			@GetMapping("/getorder/{orderid}")
			public ResponseEntity<ViewOrders> getorder(@PathVariable("orderid") int orderid)
					throws ResourceNotFoundException {
				ViewOrders vieworder = orderService.getorder(orderid);
				return ResponseEntity.ok().body(vieworder);
			}

			// http://localhost:8080/api/v1/addorder
			@PostMapping("/saveorder")
			public ViewOrders addorder(@RequestBody ViewOrders view) {

				ViewOrders vieworder = orderService.saveorder(view);

				return vieworder;
			}
			
			// http://localhost:8080/api/v1/updateorder/2
			@PutMapping("/updateorder/{orderid}")
			public ResponseEntity<ViewOrders> updateorder(@PathVariable("orderid") int orderid,
					@RequestBody ViewOrders orderDetails) throws ResourceNotFoundException {
				ViewOrders view = orderService.getorder(orderid);

				view.setorderid(orderDetails.getorderid());
				view.setuserid(orderDetails.getuserid());
				view.setorderdate(orderDetails.getorderdate());
				view.settotalprice(orderDetails.gettotalprice());
				final ViewOrders updateorder = orderService.saveorder(view);
				return ResponseEntity.ok(updateorder);
			}

		
			@DeleteMapping(value = "/deleteorder/{orderid}")
			public ResponseEntity<Object> deleteorder(@PathVariable("orderid") int orderid) {

				orderService.deleteorder(orderid);
				return new ResponseEntity<>("order deleted successsfully", HttpStatus.OK);
			}
	
	

}
