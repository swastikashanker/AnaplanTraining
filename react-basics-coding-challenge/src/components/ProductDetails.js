import React from 'react';
import productImage from '../assets/images/product-image.jpg';
import './ProductDetails.css';

const ProductDetails = () => {
  return (
    <div className="product-container">
      <div className="product-image-container">
        <img src={productImage} alt="Product" className="product-image" />
      </div>
      <div className="product-details">
        <div className="product-title-container">
          <h2 className="product-title">Artiart DEER Spill Proof Travel Cup With Flip Over Lid - 2.7</h2>
        </div>
        <div className="brand">
            <p>ARTIART</p>
          </div>
        <div className="buttons">
        <button className="add-one-button">+</button>1
        <button className="add-minus-one-button">-</button>
        </div>
        <div className="product-price">
          <p className="price">48 GloCoins</p>
        </div>
        <div className="product-actions">
          <button className="add-to-cart">ADD TO CART</button>
          <button className="wishlist">WISHLIST</button>
        </div>
        <div className="product-description">
          <h3 className="section-title">DESCRIPTION</h3>
          <p className="description-text">
        DESIGN : Premium matt finish looks elegant wherever you carry it. Unicolor design goes with whatever surroundings it is kept in. A convenient lid on top has an small and easy to sip spout which makes for easy drinking on the go
       <p>CONVENIENT : Designed for ultimate portability & comfort with one touch flip over lid mechanism which ensures spill proof performance. Moderate size rim for smooth flow of liquids in apt volume. Wide mouth ensures ease of filling with ice(if required) and also facilitates cleaning the interior, for hygiene.
       </p> <p>INNOVATIVE : Clever grip-pad suction technology reduces spillage occurrences as it will not tip over even if you accidently knock into it. Pick up easily by vertical lift like any other cup and it will detach itself easily and quickly without any effort.
       </p> <p>QUALITY : Stay healthy with our BPA free and non-toxic cups as our each and every product is constructed from 100% food grade materials. These premium grade cups won't rust, retain or transfer flavors.
       </p>Capacity: 330ml
        Hot & Cold- 2 Hours
        Item Weight : 280 g
        Item Dimensions LxWxH : 20.5 x 8.5 x 8.5 Centimeters</p> 
      </div>
      </div>
      </div>
  );
}

export default ProductDetails;