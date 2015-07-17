# Ceddl4j - A CEDDL data layer from Java #

[![Build Status](https://travis-ci.org/mirabeau-nl/ceddl4j.svg?branch=master)](https://travis-ci.org/mirabeau-nl/ceddl4j)
[![Coverage Status](https://coveralls.io/repos/mirabeau-nl/ceddl4j/badge.svg)](https://coveralls.io/r/mirabeau-nl/ceddl4j)
[![Coverity Scan Status] (https://scan.coverity.com/projects/4986/badge.svg)](https://scan.coverity.com/projects/4986)
[![Dependency Status](https://www.versioneye.com/user/projects/55579dd1b2ff6d477b00001c/badge.svg?style=flat)](https://www.versioneye.com/user/projects/55579dd1b2ff6d477b00001c)
[![javadoc.io](https://javadocio-badges.herokuapp.com/nl.mirabeau/ceddl4j/badge.svg)](https://javadocio-badges.herokuapp.com/nl.mirabeau/ceddl4j)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/nl.mirabeau/ceddl4j/badge.svg)](https://maven-badges.herokuapp.com/maven-central/nl.mirabeau/ceddl4j)

## About Ceddl4j ##

Ceddl4j is a Java component for a website data layer compliant with the [CEDDL specification](http://www.w3.org/2013/12/ceddl-201312.pdf).

The Customer Experience Digital Data Layer (CEDDL) specification 
> "describes a method for surfacing customer experience digital data on a web or other digital resource as a JavaScript Object which can be used for communicating this data to digital analytics and reporting servers."

For more background information, see our article [Ceddl4j: What & why?](https://github.com/mirabeau-nl/ceddl4j/wiki/Ceddl4j:-What-&-why%3F) 

### Example ###
To build the following Data Layer:
                
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

 You can use this code:

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
    

### Usage ###

Add the following dependency to your project's Maven POM. 

        <dependency>
            <groupId>nl.mirabeau</groupId>
            <artifactId>ceddl4j</artifactId>
            <version>1.0.0</version>
        </dependency>
        
See [Maven Central](https://maven-badges.herokuapp.com/maven-central/nl.mirabeau/ceddl4j)  for other build tools 

To get started read our [Getting started guide](https://github.com/mirabeau-nl/ceddl4j/wiki/Getting-started-guide) and see the [JavaDoc](http://www.javadoc.io/doc/nl.mirabeau/ceddl4j/).

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
		* Neither the name of Mirabeau B.V. nor the
		names of its contributors may be used to endorse or promote products
		derived from this software without specific prior written permission.

	THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
	ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
	WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
	DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY
	DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
	(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
	LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
	ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
	(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
	SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
