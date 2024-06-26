import React from 'react'

const Header = ({ toggleModal, noOfContacts }) => {
  return (
    <header className='header'>
        <div className='container'>
            <h3>Contact List ({noOfContacts})</h3>
            <button className='btn' onClick={() => toggleModal(true)}>
                <i className='bi bi-plus-square'></i>Add New Contact
            </button>
        </div>
    </header>
  )
}

export default Header
