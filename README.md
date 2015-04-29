# CEDDL4J #

[![Build Status](https://travis-ci.org/mirabeau-nl/ceddl4j.svg?branch=master)](https://travis-ci.org/mirabeau-nl/ceddl4j)
[![Coverage Status](https://coveralls.io/repos/mirabeau-nl/ceddl4j/badge.svg)](https://coveralls.io/r/mirabeau-nl/ceddl4j)

## What is CEDDL4J? ##

CEDDL4J is a Java Library for creating a Data Layer that follows the Customer Experience Digital Data Layer (CEDDL) specification.

The CEDDL specification 
> "describes a method for surfacing customer experience digital data on a web or other digital resource as a JavaScript Object which can be used for communicating this data to digital analytics and reporting servers."

The complete CEDDL specification can be found at http://www.w3.org/2013/12/ceddl-201312.pdf

CEDDL4J currently implements the full CEDDL specification except for the Privacy and Security objects.

### Example ###
This code:

            DigitalData dd = DigitalData.create("MyHomePage-Production")
                .page()
                .pageInfo()
                .pageID("Home Page")
                .destinationURL("http://mysite.com/index.html")
                .endPageInfo()
                .addPrimaryCategory("FAQ Pages")
                .addCategory("subCategory1", "ProductInfo")
                .addCategory("pageType", "FAQ")
                .addAttribute("country", "US")
                .addAttribute("language", "en-US")
                .endPage();

Will generate the following Data Layer:
                
            digitalData = {
                pageInstanceID: "MyHomePage-Production",
                page:{
                    pageInfo:{
                        pageID: "Home Page",
                        destinationURL: "http://mysite.com/index.html"
                    },
                    category:{
                        primaryCategory: "FAQ Pages",
                        subCategory1: "ProductInfo",
                        pageType: "FAQ"
                    },
                    attributes:{
                        country: "US",
                        language: "en-US"
                    }
                }
            };
            
            

### How do I get set up? ###
This section will be completed when we release. 


### Contribution guidelines ###
* Comments, methods and variables in English.
* Create unit tests where possible.
* Try to stick to the existing coding style.
* Give a short description in the pull request what you're doing and why.

### License information ###

	Copyright (c) 2015, Mirabeau B.V.
	All rights reserved.

	Redistribution and use in source and binary forms, with or without
	modification, are permitted provided that the following conditions are met:
		* Redistributions of source code must retain the above copyright
		notice, this list of conditions and the following disclaimer.
		* Redistributions in binary form must reproduce the above copyright
		notice, this list of conditions and the following disclaimer in the
		documentation and/or other materials provided with the distribution.
		* Neither the name of the <organization> nor the
		names of its contributors may be used to endorse or promote products
		derived from this software without specific prior written permission.

	THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
	ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
	WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
	DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
	DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
	(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
	LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
	ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
	(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
	SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.