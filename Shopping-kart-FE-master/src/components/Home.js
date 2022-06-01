import React from "react";
import "./Home.css";
import Product from "./Product";

function Home() {
	return (
		<div className="home">
			<div className="home__container">
			<div className="home__row">
					<Product
						id="3"
						title="Harry Potter books set: The complete collection of 7 volumes"
						price={2879}
						image="https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcSLkFlkq3nZQMXk-feTLNLgaIzp2ia0UZ_coEd4tl4slkAXdKH_F00uF9KgXM92-n3F35o-dG8fr9E&usqp=CAc"
						rating={5}
					/>
					<Product
						id="4"
						title="Philips 36 Litre OTG Oven"
						price={15000}
						image="https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcSOnIAn_Q27FRcE6gkXMFQYqoOLfQ1IoQ5nFiinpWOi8kH5GCWrDZ5wTQQlJfaGAiLn7R5V_GYRah0&usqp=CAc"
						rating={3}
					/>
					<Product
						id="5"
						title="Croma 100cm (40 inch) HD Ready LED TV (Flat Panel)"
						price={22500}
						image="https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcQgQbhJL0kyv9l5TWAvhdQy5dZfcsQ6xaBZgHphi00re3_1KYObFCVhSUIszHtdqc3iZZP1EJfa0w&usqp=CAc"
						rating={4}
					/>
				</div>
				<div className="home__row">
					<Product
						id="3"
						title="Aham Brahmasmi - Mandala's art = Men's T-shirt (Black)"
						price={550}
						image="https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcSXQtxLCvwJdowsKE2_AIw-vKw6SdF4iqQQPabqRF0hbh3c_KBpgXpBUFfP6xkXVfge14aTOcq-kg&usqp=CAc"
						rating={5}
					/>
					<Product
						id="4"
						title="Sony WH-CH510 On-ear Wireless Headphones with mic"
						price={7500}
						image="https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcSo_0WiDBf7L7anUX6kMM2pnTUEL3uhC967lynRqxynlxos0LEVHivQ9nM2WWGfM4wyDK6LlVDKXg&usqp=CAc"
						rating={3}
					/>
					<Product
						id="5"
						title="Croma 500 watts 3 jars mixer grinder"
						price={1250}
						image="https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcRbBJLUvaTXbpwKCqP9GpF2grxdsIAnsL6i3nIz2Z-PcpZIF8-w07dUQ1Tcfqd2hZUEEqFMlnL_sA&usqp=CAc"
						rating={4}
					/>
				</div>
				<div className="home__row">
					<Product
						id="3"
						title="Kellogg's Corn flakes Original Power (1.5 kg)"
						price={250}
						image="https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcSBFVSX7FZJkiEwcNXs0mdUiMIFL5sUe3elZ1-ulJdFWM8i2bSrcW_E4iZ0x5N_qGhZ0GKl_IzDlE0&usqp=CAc"
						rating={5}
					/>
					<Product
						id="4"
						title="Bajaj Platini PX97 Yorque 36 Litres Personal air cooler"
						price={75000}
						image="https://encrypted-tbn2.gstatic.com/shopping?q=tbn:ANd9GcSavruP0ea0V3Q5VhEQAucTlVukzLDU-cS7wriS-bQQha0nnfoSGIBXqYTn4lT7op5icXHi2SBchtA&usqp=CAc"
						rating={3}
					/>
					<Product
						id="5"
						title="H&M ladies pink hoodie (100% Woolen)"
						price={2050}
						image="https://encrypted-tbn0.gstatic.com/shopping?q=tbn:ANd9GcRL_hOfe5_Pm02r6N5_DL_YQaPY-NsfJZ0GM0RRlwsAEcSOEOBCndck_MCHIi0PV-bUNW9rYWcdIaM&usqp=CAcg"
						rating={4}
					/>
				</div>
				
				
			</div>
		</div>
	);
}

export default Home; 