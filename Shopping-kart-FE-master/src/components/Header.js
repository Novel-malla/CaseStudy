import React from "react";
import "./Header.css";
import SearchIcon from "@material-ui/icons/Search";
import ShoppingBasket from "@material-ui/icons/ShoppingBasket";
import { Link } from "react-router-dom";
import { useStateValue } from "../StateProvider";


function Header() {
	const [{ basket, user }, dispatch] = useStateValue();

	return (
		<div className="header">
			<Link to="/">
				<img
					className="header__logo"
					src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAALoAAACCCAMAAADG+SIDAAAAllBMVEX////NMwHNMwDLIgDMLgD57urTWUzy3drMKgDIAADqvLT+/Pv57OfQSivejYrONSPdg3ndgXHlqKX46OfKFgD89vTOPiPx1Mzz2dX2497QSzfRVUHlppzOOhXOPB7PQBjVZE/kq6LdjYHjn5bpta/YcVvtx8TTVznTXlPZemTXbGPhm43ZdWnQRjvXa13LJxLRTEbQQjHVEWbzAAADiUlEQVR4nO2a25KiMBCGIQnagLOrayKg4nqYdWfH0/j+L7cJjtaMYMBYlWBVf1dAuPjrr06604nnIQiCIAiCIAiCIAiCIAiCIMiTMrwiG7pW1JSMhleMA9eaGhJR9glhxCfEZ5NnkT6FPJ/NZiPFjPi+z16eRXqQXRgmXLmeP4v0r8ShdJ3A08zTr4TSdcKfUjoo6WHXtQwTfjMZMWHiWoYJc1ABE7mWYUKfStf5wrUME5ZUub5yLcOEFZeu04FrGSa8cuk6/HEtw4S1ch3+isCc2JV0Feskf+uYMnE2TxJVPPqEmQKQuZKejlTtaA7950q5l42ZX/hOfFL9cHOgeKDOTPd6E/aQ6X1Xk1QW751HXCe5w+pHvMNzRrrca2zhAdfdVsuDB1x3XEAsgRi7Dmun0qfUWDpsnSr3FtQ4J4Xu1vSCyNh1u/VmEpXYmLpOmM1IX1AoU2fujQECW4uJVOwYaUQj07nVRDrntAnfl8sbrsPEpnLP6zYhW0G974S2sncjOlDrOuyFa5lVpKw2YOwk0rgiJE4jWXXArDv1ZY2VSE8O5XkYqgwe35y0rH6a2lhexDstL37w4hUdGOPlEfYW1nTRr0pDqj0aVQ1c8pTWdcKs9FeDcu6P0mJkXTHSrDqAjrsdaR3xHHSuh27rdC1ipOsT2E6k9xAMqC7WqdWThHV+fUIdhlJAMit/VmizKbxZTaRQzjJ07sVjWpt8yoR2j294Gbr2xKz8Ga5dvn6HkVXlXvKrhFol0vLneU0VYDnS70FwonXdcqTfg5SuN/3Vqpz4zNVrBcEAtLHOZjaFd/cvZ1SYxtMXDaBfc+yeDos5P5+eUBWnUQiaAxai7wiA1Vs/AVzqcj6V75uwtIsuIqHRjpvbjfRocOZVLQ7D5eA7c7WfY5PPt76WZbuWl+Sgdh9L1zJM6B5UkI9/NKBlpnu9j/FR8rMG9Ufb0lEvyYJeDYHIkiQI2qU82x+Pu03dX2KzO+727bqYt+CUEcZrJml65PIv2qpbqCkvOl1spD2gEB/FrqlVRaPcPp+yJU11v63oqblBp7aE1ZMeT9tnlusOQC/HwrRFd8SSnJyan9oTiuCz80uOjs+9vtItXJfTVNtCFNvCdRK26nbbUu5FGT3UTL81yL8A+nY0NWUzhlFfO0cVUYfl+9a1vIJek3tnoteyTIogCIIgCIIgCIIgCIIgCIIg9/IfmA1O0t9OfPIAAAAASUVORK5CYII="
					alt="e shopping cart"
				/>
			</Link>

			<div className="header__search">
				<input className="header__searchInput" placeholder="Search" />
				<SearchIcon className="header__searchIcon" />
			</div>
			<div className="header__nav">
				<Link to={!user && "/login"}>
					<div className="header__option">
						<span className="header__optionLineOne">
							Hello {user ? user.email : "Guest"}
						</span>
						<span
							// onClick={handleAuth}
							className="header__optionLineTwo"
						>
							{user ? "Sign Out" : "Sign In"}
						</span>
					</div>
				</Link>
			

				<Link to="/checkout">
					<div className="header__optionBasket">
						<ShoppingBasket />
						<span className="header__optionLineTwo header__optionBasketCount">
							{basket?.length}
						</span>
					</div>
				</Link>
			</div>
		</div>
	);
}

export default Header;
