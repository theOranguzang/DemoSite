/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mycompany.controller.account;

import org.broadleafcommerce.core.web.controller.account.DefaultOrderHistoryController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/orders")
public class OrderHistoryController extends DefaultOrderHistoryController {

	@RequestMapping("")
    public String viewOrderHistory(Model model, HttpServletRequest request) {
		return super.viewOrderHistory(model, request);
    }

	@RequestMapping("/{orderNumber}")
    public String viewOrderDetails(Model model, HttpServletRequest request, 
    		@PathVariable String orderNumber) {
		return super.viewOrderDetails(model, request, orderNumber);
    }
    
}
