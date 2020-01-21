import { Component, AfterViewInit } from '@angular/core';
import * as $ from 'jquery';
declare var $: any;

@Component({
    selector: 'app-layout-sidebar',
    templateUrl: './sidebar.component.html',
    styleUrls: ['./sidebar.component.css']
})

export class SidebarComponent implements AfterViewInit{
    ngAfterViewInit(): void {
        $(".sidebar-dropdown > a").click(function () {
            $(".sidebar-submenu").slideUp(200);
            if (
              $(this)
                .parent()
                .hasClass("active")
            ) {
              $(".sidebar-dropdown").removeClass("active");
              $(this)
                .parent()
                .removeClass("active");
            } else {
              $(".sidebar-dropdown").removeClass("active");
              $(this)
                .next(".sidebar-submenu")
                .slideDown(200);
              $(this)
                .parent()
                .addClass("active");
            }
          });
        
          $("#close-sidebar").click(function () {
            $(".page-wrapper").removeClass("toggled");
          });
          $("#show-sidebar").click(function () {
            $(".page-wrapper").addClass("toggled");
          });
    }

}